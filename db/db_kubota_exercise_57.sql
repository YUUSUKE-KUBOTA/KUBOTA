/* 追加演習57 */
SELECT
    CASE
	  WHEN (SELECT  FROM pairings WHERE pairings.id = 39) > (SELECT  FROM pairings WHERE pairings.id = 103) THEN 'win:日本'
	  WHEN (SELECT  FROM pairings WHERE pairings.id = 39) < (SELECT  FROM pairings WHERE pairings.id = 103) THEN 'win:コロンビア'
	END