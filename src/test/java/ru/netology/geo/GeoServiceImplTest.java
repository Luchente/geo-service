package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

public class GeoServiceImplTest {

    private final GeoService geoService = new GeoServiceImpl();

    @Test
    void byIp_shouldReturnRussiaFor172() {
        Location location = geoService.byIp("172.123.12.19");
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    void byIp_shouldReturnUSAFor96() {
        Location location = geoService.byIp("96.44.183.149");
        assertEquals(Country.USA, location.getCountry());
    }
}
