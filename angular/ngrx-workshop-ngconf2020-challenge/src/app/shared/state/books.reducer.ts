import { createReducer, on, Action, createSelector } from "@ngrx/store";
import { BookModel, calculateBooksGrossEarnings } from "src/app/shared/models";
import { BooksPageActions, BooksApiActions } from "src/app/books/actions";
import { state } from "@angular/animations";



const createBook = (books: BookModel[], book: BookModel) => [...books, book];
const updateBook = (books: BookModel[], changes: BookModel) =>
  books.map(book => {
    return book.id === changes.id ? Object.assign({}, book, changes) : book;
  });
const deleteBook = (books: BookModel[], bookId: string) =>
  books.filter(book => bookId !== book.id);


 
export interface State{
    collection: BookModel[];
    activeBookId:string | null;
}

export const initialState:State={
    collection: [],
    activeBookId: null
}

export const bookReducer=createReducer(
    initialState,
    on(
        BooksPageActions.enter,
        BooksPageActions.clearSelectedBook,
        (state,action)=>{
        return {
            // collection:state.collection,
            ...state,
            activeBookId:null
        };
    }),

    on(BooksPageActions.selectBook,(state,action)=>{
        return {
            ...state,
            activeBookId:action.bookId
        };
    })

);
