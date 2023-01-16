import { createAction, props } from "@ngrx/store";
import { BookRequiredProps } from "src/app/shared/models";


/*
[Books page] Create a Book
    -BookRequiredProps
*/
/*
const createBook=createAction(
    '[Books page] Create a Book',
    props<{book:BookRequiredProps}>()
)
*/

export const enter=createAction('[Book page] Enter');

export const selectBook=createAction(
    '[Books page] Select Book',
    props<{bookId:string}>()
);

export const clearSelectedBook=createAction(
    '[Books page] clear Selected Book'
);

export const createBook=createAction(
    '[Books page] Create Book',
    props<{book:BookRequiredProps}>()
)

export const updateBook=createAction(
    '[Books page] Update Book',
    props<{bookId:string; changes:BookRequiredProps}>()
)

export const deleteBook=createAction(
    '[Books page] Delete Book',
    props<{bookId:string}>()
)
