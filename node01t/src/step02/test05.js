// delete 실행 
var mysql = require('mysql'); 

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java85',
  password : '1111',
  database : 'java85db'
});

connection.connect();

// select 질의하기
connection.query(
  "delete from boards where no=?", 
  [47], 
  function(err, rows, fields) {
	  if (err) throw err;
	  
	  console.log("삭제 성공!");
});


connection.end();
