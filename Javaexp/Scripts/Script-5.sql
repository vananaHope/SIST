SELECT DISTINCT job FROM emp ORDER BY job;

SELECT DISTINCT m.empno, m.ename, m.job
FROM emp e, emp m
WHERE e.mgr = m.EMPNO
ORDER BY m.ename;

7698	BLAKE
7782	CLARK
7902	FORD
7566	JONES
7839	KING

SELECT * FROM dept;