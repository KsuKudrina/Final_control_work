DELIMITER $$
CREATE FUNCTION age_animal (DateBirth DATE)
RETURNS TEXT
DETERMINISTIC
BEGIN
    DECLARE res TEXT DEFAULT '';
	SET res = CONCAT(
            TIMESTAMPDIFF(YEAR, DateBirth, CURDATE()),
            ' years ',
            TIMESTAMPDIFF(MONTH, DateBirth, CURDATE()) % 12,
            ' month'
        );
	RETURN res;
END $$
DELIMITER ;