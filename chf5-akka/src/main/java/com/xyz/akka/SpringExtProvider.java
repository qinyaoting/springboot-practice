package com.xyz.akka;

import akka.actor.AbstractExtensionId;
import akka.actor.ExtendedActorSystem;

public class SpringExtProvider extends AbstractExtensionId<SpringExt> {
    private static SpringExtProvider provider = new SpringExtProvider();

    public static SpringExtProvider getInstance() {
        return provider;
    }

    @Override
    public SpringExt createExtension(ExtendedActorSystem extendedActorSystem) {
        return new SpringExt();
    }
}
