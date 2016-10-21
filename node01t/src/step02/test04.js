// update 실행 
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
  "update boards set title=? where no=47", 
  ['okok'], // in-param에 들어갈 값을 배열에 담는다.
  function(err, rows, fields) {
	  if (err) throw err;
	  
	  console.log("변경 성공!");
});


connection.end();
