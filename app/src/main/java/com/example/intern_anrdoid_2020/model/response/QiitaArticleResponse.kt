package com.example.intern_anrdoid_2020.model.response

import java.io.Serializable
import java.util.*

class QiitaArticleResponse : Serializable {
    var rendered_body: String? = null
    var body: String? = null
    var coediting: Boolean? = null
    var createdAt: String? = null
    var group: Group? = null
    var id: String? = null
    var likesCount: Int? = null
    var isPrivate: Boolean? = null
    var reactionsCount: Int? = null
    var tags: List<Tags>? = null
    var title: String? = null
    var updatedAt: String? = null
    var url: String? = null
    var user: User? = null
    var pageViewsCount: String? = null

    class Group : Serializable {
        var createdAt: Date? = null
        var id: Int? = null
        var name: String? = null
        var isPrivate: Boolean? = null
        var updatedAt: String? = null
        var urlName: String? = null
    }

    class Tags : Serializable {
        var name: String? = null
        var versions: List<String>? = null
    }

    class User : Serializable {
        var description: String? = null
        var facebookId: String? = null
        var followeesCount: Int? = null
        var followersCount: Int? = null
        var githubLoginName: String? = null
        var id: String? = null
        var itemsCount: Int? = null
        var linkedinId: String? = null
        var location: String? = null
        var name: String? = null
        var organization: String? = null
        var permanentId: Int? = null
        var profileImageUrl: String? = null
        var teamOnly: Boolean? = null
        var twitterScreenName: String? = null
        var websiteUrl: String? = null
    }
}
