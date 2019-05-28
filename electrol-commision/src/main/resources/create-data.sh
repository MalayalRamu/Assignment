#create parties
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/party' -d '{"name":"BJP"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/party' -d '{"name":"YSRCP"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/party' -d '{"name":"INC"}'

#create constituencies
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"Delhi"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"Mumbai"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"HYD"}'

#Register voters
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"ramu","constituency":{"id":1}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"gopi","constituency":{"id":2}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"sairao","constituency":{"id":2}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"shyam","constituency":{"id":2}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"mani","constituency":{"id":3}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"harish","constituency":{"id":3}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"vijay","constituency":{"id":3}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"reddy","constituency":{"id":3}}'


#curl -XGET -H 'content-type: application/json' 'http://localhost:8080/ec/constituencies'
#curl -XGET -H 'content-type: application/json' 'http://localhost:8080/ec/parties'
#curl -XGET -H 'content-type: application/json' 'http://localhost:8080/ec/voters'

#Cast a vote
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":1,"partyId":1}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":2,"partyId":3}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":3,"partyId":2}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":4,"partyId":3}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":5,"partyId":1}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":6,"partyId":2}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":7,"partyId":3}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/cast' -d '{"voterId":8,"partyId":2}'



