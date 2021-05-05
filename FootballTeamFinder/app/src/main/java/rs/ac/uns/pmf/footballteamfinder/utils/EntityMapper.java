package rs.ac.uns.pmf.footballteamfinder.utils;

public interface EntityMapper<Entity, DomainModel> {

    DomainModel mapFromEntity(Entity entity);

    Entity mapToEntity(DomainModel domainModel);

}
