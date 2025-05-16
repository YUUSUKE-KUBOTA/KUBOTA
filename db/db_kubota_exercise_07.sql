/* í«â¡ââèK7 */
SELECT
    id,
    country_id,
    uniform_num,
    position,
    name,
    club,
    birth,
    height,
    weight
FROM
    players
WHERE
    position IN ('GK', 'DF', 'MF');