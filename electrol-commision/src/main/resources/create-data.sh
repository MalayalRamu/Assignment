#create parties
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/party' -d '{"name":"BJP"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/party' -d '{"name":"YSRCP"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/party' -d '{"name":"INC"}'

#create constituencies
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"AP1"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"AP2"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"AP3"}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/constituency' -d '{"name":"AP4"}'

#Register voters
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"ramu","constituency":{"id":6}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"gopi","constituency":{"id":6}}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter' -d '{"name":"sairao","constituency":{"id":5,"name":"AP1"}}'


#curl -XGET -H 'content-type: application/json' 'http://localhost:8080/ec/constituencies'
#curl -XGET -H 'content-type: application/json' 'http://localhost:8080/ec/parties'
#curl -XGET -H 'content-type: application/json' 'http://localhost:8080/ec/voters'

#Cast a vote
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter/cast' -d '{"voterId":9,"partyId":3}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter/cast' -d '{"voterId":10,"partyId":3}'
curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/voter/cast' -d '{"voterId":8,"partyId":3}'


curl -XPOST -H 'content-type: application/json' 'http://localhost:8080/ec/vote/details' -d '{"Id":1}'
