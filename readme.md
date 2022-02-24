// masterdb
docker run --rm -dp 3307:3306 --network mysql-cluster-net -e MYSQL_ROOT_PASSWORD=0000 -e MYSQL_DATABASE=proxy_sql_app --name masterdb masterdb:latest
// slave
docker run --rm -dp 3308:3306 --network mysql-cluster-net -e MYSQL_ROOT_PASSWORD=0000 -e MYSQL_DATABASE=proxy_sql_app --name slave-01 slave-01:latest
//proxy_sql
docker run --rm --network mysql-cluster-net --name proxysql -p 6032:6032 -p 6033:6033 -v pxy:/var/lib/proxysql proxysql:latest
