/* í«â¡ââèK50 */
SELECT
    name,
    (SELECT
        COUNT(goals.id)
     FROM
        goals
     WHERE
        goals.player_id = players.id
     GROUP BY
        player_id) AS sum_point
FROM
    players
WHERE
    0 = 0
ORDER BY
    sum_point DESC;