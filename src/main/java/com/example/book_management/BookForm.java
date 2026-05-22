package com.example.book_management;

import jakarta.validation.constraints.*;

public class BookForm {
    @NotBlank(message = "タイトルは必須です")
    @Size(min = 1, max = 100, message = "タイトルは1〜100文字である必要があります")
    private String title;

    @NotBlank(message = "著者は必須です")
    @Size(min = 1, max = 100, message = "著者は1〜100文字である必要があります")
    private String author;

    @NotBlank(message = "ISBNは必須です")
    @Pattern(regexp = "^[0-9]{3}-[0-9]{10}$|^[0-9]{13}$", message = "ISBNの形式が正しくありません")
    private String isbn;

    @NotNull(message = "価格は必須です")
    @Positive(message = "価格は正の数である必要があります")
    @Max(value = 1000000, message = "価格は1000000以下である必要があります")
    private Double price;

    // ゲッター・セッター
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}