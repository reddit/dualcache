package com.vincentbrison.openlibraries.android.dualcache.lib.configurationsToTest;

import com.vincentbrison.openlibraries.android.dualcache.Builder;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheTest;
import com.vincentbrison.openlibraries.android.dualcache.lib.testobjects.AbstractVehicule;

public class RamDefaultSerializerDiskDefaultSerializer extends DualCacheTest {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        cache = new Builder<AbstractVehicule>(CACHE_NAME, TEST_APP_VERSION)
            .enableLog()
            .useSerializerInRam(RAM_MAX_SIZE, defaultCacheSerializer)
            .useSerializerInDisk(DISK_MAX_SIZE, true, defaultDiskCacheSerializer, getContext())
            .build();
    }
}
