/* ’Ç‰Á‰‰K47 */
SELECT
    players.AVG(height)
FROM
    countries
	INNER JOIN players 
WHERE
    position = 'GK';