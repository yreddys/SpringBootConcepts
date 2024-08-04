**While developing any spring boot API, We create many rest endpoints for the CRUD operation on data. After some time when a large number of records get inserted into DB, then fetching the records from DB takes more time, because it fetches all the records.**

   To overcome this problem there are multiple ways like -
         1.We can have filters in our queries which are getting data.
         2.We can set the limit
         3.We can have pagination


**In spring boot for implementing paging and sorting, we need to extend PagingAndSortingRepository**
