/* 追加演習57 */
SELECT
    CASE
        WHEN japan_goals > colombia_goals THEN 'win:日本 lose:コロンビア'
        WHEN japan_goals < colombia_goals THEN 'win:コロンビア lose:日本'
        ELSE '引き分け'
    END AS result
FROM (
    SELECT
        (SELECT
           COUNT(goals.id)
         FROM 
           pairings
           INNER JOIN goals ON pairings.id = goals.pairing_id
           INNER JOIN players ON goals.player_id = players.id
         WHERE
           pairing_id = 39) AS japan_goals,
        (SELECT
           COUNT(goals.id)
         FROM
           pairings
           INNER JOIN goals ON pairings.id = goals.pairing_id
           INNER JOIN players ON goals.player_id = players.id
         WHERE
           pairing_id = 103) AS colombia_goals
) AS scores;