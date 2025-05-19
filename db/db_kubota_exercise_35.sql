/* í«â¡ââèK35 */
SELECT
    player.position,
    (SELECT MAX(height)) AS max_height,
    (SELECT TOP 1 name FROM players WHERE position = player.position ORDER BY height DESC) AS player_name
FROM
    players AS player
WHERE
    0 = 0
GROUP BY 
    player.position;