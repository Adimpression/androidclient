/*
 * Kontalk Android client
 * Copyright (C) 2018 Kontalk Devteam <devteam@kontalk.org>

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kontalk.service.registration.event;

import java.io.InputStream;

import android.support.annotation.Nullable;

import org.kontalk.client.EndpointServer;


/**
 * Post this to request to the registration service to import a keypack from
 * a zip file.
 * @author Daniele Ricci
 */
public class ImportKeyRequest {

    /** Will be null if we are to auto-detect it from the key. */
    public final EndpointServer server;
    public final InputStream in;
    public final String passphrase;

    public ImportKeyRequest(@Nullable EndpointServer server, InputStream in, String passphrase) {
        this.server = server;
        this.in = in;
        this.passphrase = passphrase;
    }

}