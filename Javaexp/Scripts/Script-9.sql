UPDATE CODE 
	SET title = '변경',
		refno = 0,
		ordno = 1,
		val = '변경'
	WHERE NO = 1017;
	
DELETE FROM CODE c 
WHERE NO = 1017;
/*
select *
from code
where no = ? 

UPDATE CODE 
	SET title = ?,
		refno = ?,
		ordno = ?,
		val = ?
	WHERE NO = ?;
	
DELETE FROM CODE c 
WHERE NO = ?;
*/