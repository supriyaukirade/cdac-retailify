package com.cdac.retailify.service;

import org.springframework.web.multipart.MultipartFile;

import com.cdac.retailify.io.ItemRequest;
import com.cdac.retailify.io.ItemResponse;

import java.io.IOException;
import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file) throws IOException;

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);
}
