package com.solarx.myapplication.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.solarx.myapplication.entity.BookEntity;
import com.solarx.myapplication.repository.BookRepository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private BookRepository bookRepository = new BookRepository();
    private final MutableLiveData<List<BookEntity>> _books = new MutableLiveData<>();
    public final LiveData<List<BookEntity>> books = _books;

    public void getBooks(){
        _books.setValue(bookRepository.getBooks());
    }

}