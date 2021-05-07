package rs.ac.uns.pmf.footballteamfinder.core.mappers;

import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.core.domain.Team;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.team.TeamItemNetworkEntity;
import rs.ac.uns.pmf.footballteamfinder.utils.EntityMapper;

public class TeamMapper implements EntityMapper<TeamItemNetworkEntity, Team> {


    @Override
    public Team mapFromEntity(TeamItemNetworkEntity teamItemNetworkEntity) {
        return new Team(
                teamItemNetworkEntity.getTeamNetworkEntity().getId(),
                teamItemNetworkEntity.getTeamNetworkEntity().getLogo(),
                teamItemNetworkEntity.getTeamNetworkEntity().getCountry(),
                teamItemNetworkEntity.getVenueNetworkEntity().getCity(),
                teamItemNetworkEntity.getVenueNetworkEntity().getName(),
                teamItemNetworkEntity.getTeamNetworkEntity().getFounded()
        );
    }

    @Override
    public TeamItemNetworkEntity mapToEntity(Team team) {
        return null;
    }

    public List<Team> mapFromEntityList(List<TeamItemNetworkEntity> teamItemNetworkEntities) {
        List<Team> teams = new ArrayList<>();
        for (TeamItemNetworkEntity entity : teamItemNetworkEntities) {
            teams.add(mapFromEntity(entity));
        }
        return teams;
    }

}
