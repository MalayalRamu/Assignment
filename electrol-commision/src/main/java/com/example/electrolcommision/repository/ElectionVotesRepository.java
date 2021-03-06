package com.example.electrolcommision.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.electrolcommision.entity.ElectionVotes;
import com.example.electrolcommisioncom.domain.WinningParty;

@Repository
public interface ElectionVotesRepository extends CrudRepository<ElectionVotes, Long>{
	
//	@Query("select new com.example.electrolcommisioncom.domain.WinningParty(ev.partyid as id, count(ev) as count) FROM ElectionVotes ev GROUP BY ev.partyid ORDER BY count(ev) DESC")
	@Query("select new com.example.electrolcommisioncom.domain.WinningParty(ev.party as party, count(ev) as count) FROM ElectionVotes ev GROUP BY ev.party ORDER BY count(ev) DESC")
	public List<WinningParty> overallWinningParty();
	
//	@Query("select new com.example.electrolcommisioncom.domain.WinningParty(ev.partyid as id, count(ev) as count) FROM ElectionVotes ev where ev.constituencyid= (:id) GROUP BY ev.partyid ORDER BY count(ev) DESC")
	@Query("select new com.example.electrolcommisioncom.domain.WinningParty(ev.party as party, count(ev) as count) FROM ElectionVotes ev where ev.constituency= (:id) GROUP BY ev.party ORDER BY count(ev) DESC")
	public List<WinningParty> constituencyWinningParty(@Param("id") Long id);
	
}
