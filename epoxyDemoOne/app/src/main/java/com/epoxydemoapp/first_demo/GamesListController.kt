package com.epoxydemoapp.first_demo

import com.airbnb.epoxy.TypedEpoxyController
import com.epoxydemoapp.header
import com.epoxydemoapp.onelineWithIcon

class GamesListController : TypedEpoxyController<Container>() {
    override fun buildModels(container: Container?) {
        container?.genres?.forEachIndexed {pos, model ->
            header {
                id(pos)
                genre(model.genre)
                onHeaderExpanded { mdl, _, _, _ ->
                    container.onGenreExpanded(mdl.genre())
                }
            }

            if (model.genre.isExpanded) {
                model.games.forEach { game ->
                    onelineWithIcon {
                        id(game.id)
                        game(game)
                    }
                }
            }

/*            header {
                id(it.header.id)
                genre(it.genre)
                onHeaderExpanded { model, _, _, _ ->
                    container.onGenreExpanded(model.genre())
                }
            }
            if (it.genre.isExpanded) {
                it.games.forEach { game ->
                    onelineWithIcon {
                        id(game.id)
                        game(game)
                    }
                }
            }*/

        }
    }
}