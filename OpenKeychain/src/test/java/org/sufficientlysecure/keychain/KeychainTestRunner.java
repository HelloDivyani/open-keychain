package org.sufficientlysecure.keychain;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

public class KeychainTestRunner extends RobolectricTestRunner {

    public KeychainTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    @Override
    protected Config buildGlobalConfig() {
        return new Config.Builder()
                .setSdk(25)
                .setConstants(WorkaroundBuildConfig.class)
                .build();
    }
}
