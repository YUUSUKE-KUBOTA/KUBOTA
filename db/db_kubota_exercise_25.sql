/* �ǉ����K25 */
SELECT
    SUBSTRING(CONVERT(varchar, birth, 112), 1, 4) + '�N' + SUBSTRING(CONVERT(varchar, birth, 112), 5, 2) + '��' + SUBSTRING(CONVERT(varchar, birth, 112), 7, 2) + '��'
FROM
    players
WHERE
    0 = 0;