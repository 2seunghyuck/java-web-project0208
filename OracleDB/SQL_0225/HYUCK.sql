select c.name
from customer c, orders o, book b
where c.custid=o.custid and o.bookid=b.bookid
and b.publisher='대한미디어';