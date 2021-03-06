package rs.ac.uns.pmf.footballteamfinder.core.mappers;

import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues.LeagueItemNetworkEntity;
import rs.ac.uns.pmf.footballteamfinder.utils.EntityMapper;

public class LeagueMapper implements EntityMapper<LeagueItemNetworkEntity, League> {

    @Override
    public League mapFromEntity(LeagueItemNetworkEntity leagueItemNetworkEntity) {
        return new League(
                leagueItemNetworkEntity.getLeagueNetworkEntity().getId(),
                leagueItemNetworkEntity.getLeagueNetworkEntity().getName(),
                leagueItemNetworkEntity.getLeagueNetworkEntity().getLogo(),
                leagueItemNetworkEntity.getLeagueNetworkEntity().getType(),
                leagueItemNetworkEntity.getCountryNetworkEntity().getName()
        );
    }

    @Override
    public LeagueItemNetworkEntity mapToEntity(League league) {
        return null;
    }

    public List<League> mapFromEntityList(List<LeagueItemNetworkEntity> leagueItemNetworkEntities) {
        List<League> leagues = new ArrayList<>();
        for (LeagueItemNetworkEntity entity : leagueItemNetworkEntities) {
            leagues.add(mapFromEntity(entity));
        }
        return leagues;
    }

}
