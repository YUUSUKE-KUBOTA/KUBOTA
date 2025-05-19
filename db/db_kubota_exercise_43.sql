/* í«â¡ââèK43 */
SELECT
    height,
    name,
    club,
    position
FROM
    (SELECT 
        height,
        name,
        club,
        position,
        RANK() OVER (PARTITION BY position ORDER BY height DESC) as rank
     FROM 
        players
    ) AS ranked_players
WHERE
    rank = 1;