package com.backend.hibernateadvance.services;

public interface EncryptionService {

    String encrypt(String text);

    String decrypt(String encryptedText);
}
