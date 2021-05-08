package rs.ac.uns.pmf.footballteamfinder.core.mappers;

import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.core.domain.Address;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.address.AddressNetworkEntity;
import rs.ac.uns.pmf.footballteamfinder.utils.EntityMapper;

public class AddressMapper implements EntityMapper<AddressNetworkEntity, Address> {

    @Override
    public Address mapFromEntity(AddressNetworkEntity addressNetworkEntity) {
        if (null != addressNetworkEntity) {
            return new Address(
                    addressNetworkEntity.getCountry(),
                    addressNetworkEntity.getState(),
                    addressNetworkEntity.getCounty()
            );
        }
        return null;
    }

    @Override
    public AddressNetworkEntity mapToEntity(Address address) {
        return null;
    }

    public List<Address> mapFromEntityList(List<AddressNetworkEntity> addressNetworkEntities) {
        List<Address> addresses = new ArrayList<>();
        for (AddressNetworkEntity entity : addressNetworkEntities) {
            addresses.add(mapFromEntity(entity));
        }
        return addresses;
    }

}
