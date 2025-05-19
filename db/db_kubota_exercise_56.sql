/* ’Ç‰Á‰‰K56 */
SELECT
    goals.goal_time
FROM
    pairings
    INNER JOIN goals ON (pairings.id = goals.pairing_id)
WHERE
    pairing_id = 103;