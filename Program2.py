import sqlite3
conn = sqlite3.connect("Mydatabase.db")
#conn.execute("CREATE TABLE ITEMS(I_ID INT PRIMARY KEY NOT NULL,I_NAME TEXT,QUANTITY INT,PRICE INT);")
conn.execute("INSERT INTO ITEMS (I_ID,I_NAME,QUANTITY,PRICE) VALUES (180,'dal',0,68)")
l=conn.execute("SELECT * FROM ITEMS")
print(l)