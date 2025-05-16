/* í«â¡ââèK41 */
SELECT
    goals.goal_time,
     (SELECT 
       name
     FROM 
       players 
     WHERE 
       goals.player_id = players.id
     ) AS player_name
FROM
    goals
WHERE
    goals.player_id IS NOT NULL