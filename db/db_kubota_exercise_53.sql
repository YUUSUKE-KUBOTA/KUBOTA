/* ’Ç‰Á‰‰K53 */
SELECT
    p_player.birth,
    (SELECT CASE
         WHEN   DATEDIFF(MONTH, b_player.birth, '2014-06-13') > 0
		    OR  DATEDIFF(MONTH, b_player.birth, '2014-06-13') = 0
			AND DATEDIFF(DAY, b_player.birth, '2014-06-13') < 0
	       THEN DATEDIFF(YEAR, b_player.birth, '2014-06-13') 
	     ELSE DATEDIFF(YEAR, b_player.birth, '2013-06-13') 
    END
	FROM players AS b_player WHERE b_player.id = p_player.id) AS age,
    p_player.name,
    p_player.position
FROM
    players AS p_player
WHERE
    0 = 0
ORDER BY
    birth ASC;