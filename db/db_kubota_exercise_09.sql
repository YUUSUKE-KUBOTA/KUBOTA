/* ’Ç‰Á‰‰K9 */
SELECT
    id,
    pairing_id,
    player_id,
    goal_time
FROM
    goals
WHERE
    player_id IS NOT NULL;