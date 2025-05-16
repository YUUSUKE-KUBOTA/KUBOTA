/* ’Ç‰Á‰‰K25 */
SELECT
    SUBSTRING(CONVERT(varchar, birth, 112), 1, 4) + '”N' + SUBSTRING(CONVERT(varchar, birth, 112), 5, 2) + 'Œ' + SUBSTRING(CONVERT(varchar, birth, 112), 7, 2) + '“ú'
FROM
    players
WHERE
    0 = 0;