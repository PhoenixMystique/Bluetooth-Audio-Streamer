package com.example.bluetooth;

public interface OnBluetoothRecording {

        void onStartRecording(boolean state,boolean bluetoothFlag);
        void onCancelRecording();

}
