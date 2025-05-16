/* ’Ç‰Á‰‰K44 */
SELECT
    uniform_num,
    position,
    name,
    height
FROM
    players
WHERE
    (SELECT AVG(height) FROM players) > height;