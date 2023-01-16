import { createAction, props } from "@ngrx/store";
import { BookModel } from "src/app/shared/models";

export const booksLoaded=createAction(
    '[Books API] Books Loaded Success',
    props<{books:BookModel[] }>()
);

export const bookCreated=createAction(
    '[Books API] Books Created Success',
    props<{books:BookModel }>()
);

export const bookUpdated=createAction(
    '[Books API] Books Updated Success',
    props<{books:BookModel }>()
);

export const bookDeleted=createAction(
    '[Books API] Books Deleted Success',
    props<{bookId:string }>()
);
