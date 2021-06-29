//
// Copyright Aliaksei Levin (levlam@telegram.org), Arseny Smirnov (arseny30@gmail.com) 2014-2020
//
// Distributed under the Boost Software License, Version 1.0. (See accompanying
// file LICENSE_1_0.txt or copy at http://www.boost.org/LICENSE_1_0.txt)
//
package org.drinkless.tdlib;

/**
 * Main class for interaction with the TDLib using JSON interface.
 */
public final class JsonClient {
    static {
        try {
            System.loadLibrary("tdjson");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public static native long td_json_client_create();

    public static native void td_json_client_send(long client, String request);

    public static native String td_json_client_receive(long client, double timeout);

    public static native String td_json_client_execute(long client, String request);

    public static native void td_json_client_destroy(long client);

    public static native int td_create_client_id();

    public static native void td_send(int client_id, String request);

    public static native String td_receive(double timeout);

    public static native String td_execute(String request);
}