/* �ǉ����K57 */
SELECT
    CASE
	  WHEN (SELECT  FROM pairings WHERE pairings.id = 39) > (SELECT  FROM pairings WHERE pairings.id = 103) THEN 'win:���{'
	  WHEN (SELECT  FROM pairings WHERE pairings.id = 39) < (SELECT  FROM pairings WHERE pairings.id = 103) THEN 'win:�R�����r�A'
	END