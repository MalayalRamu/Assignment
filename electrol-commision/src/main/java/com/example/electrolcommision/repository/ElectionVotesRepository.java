package com.example.electrolcommision.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommision.entity.Party;
import com.example.electrolcommisioncom.domain.WinningParty;

@Repository
public interface ElectionVotesRepository extends CrudRepository<ElectionVotes, Long>{
//	@EntityGraph(attributePaths = {"Party","Constituency"})
//	ElectionVotes findOneWithPartyAndConstituencyByPartyIdAndConstituencyId(Long partyId, Long constituencyId);
	
	@Query("select new com.example.electrolcommisioncom.domain.WinningParty(party_id, count(party_id) as count) FROM ElectionVotes ev GROUP BY party_id ORDER BY count(party_id) DESC")
	public List<Integer> winningParty();
	
}
