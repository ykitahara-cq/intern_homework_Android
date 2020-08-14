package com.example.intern_anrdoid_2020.model.response

import java.util.*

//class QiitaArticleResponse : Serializable {
//    var rendered_body: String? = null
//    var body: String? = null
//    var coediting: Boolean? = null
//    var createdAt: String? = null
//    var group: Group? = null
//    var id: String? = null
//    var likesCount: Int? = null
//    var isPrivate: Boolean? = null
//    var reactionsCount: Int? = null
//    var tags: List<Tags>? = null
//    var title: String? = null
//    var updatedAt: String? = null
//    var url: String? = null
//    var user: User? = null
//    var pageViewsCount: String? = null
//
//    class Group : Serializable {
//        var createdAt: Date? = null
//        var id: Int? = null
//        var name: String? = null
//        var isPrivate: Boolean? = null
//        var updatedAt: String? = null
//        var urlName: String? = null
//    }
//
//    class Tags : Serializable {
//        var name: String? = null
//        var versions: List<String>? = null
//    }
//
//    class User : Serializable {
//        var description: String? = null
//        var facebookId: String? = null
//        var followeesCount: Int? = null
//        var followersCount: Int? = null
//        var githubLoginName: String? = null
//        var id: String? = null
//        var itemsCount: Int? = null
//        var linkedinId: String? = null
//        var location: String? = null
//        var name: String? = null
//        var organization: String? = null
//        var permanentId: Int? = null
//        var profileImageUrl: String? = null
//        var teamOnly: Boolean? = null
//        var twitterScreenName: String? = null
//        var websiteUrl: String? = null
//    }
//}

@kotlinx.serialization.Serializable
data class QiitaArticleResponse(

        var rendered_body: String?,
        var body: String?,
        var coediting: Boolean?,
        var createdAt: String?,
        var group: Group?,
        var id: String?,
        var likesCount: Int?,
        var isPrivate: Boolean?,
        var reactionsCount: Int?,
        var tags: List<Tags>?,
        var title: String?,
        var updatedAt: String?,
        var url: String?,
        var user: User?,
        var pageViewsCount: String?
)

@kotlinx.serialization.Serializable
data class Group(
        var createdAt: Date?,
        var id: Int?,
        var name: String?,
        var isPrivate: Boolean?,
        var updatedAt: String?,
        var urlName: String?
)

@kotlinx.serialization.Serializable
data class Tags(
        var name: String?,
        var versions: List<String>?
)

@kotlinx.serialization.Serializable
data class User(
        var description: String?,
        var facebookId: String?,
        var followeesCount: Int?,
        var followersCount: Int?,
        var githubLoginName: String?,
        var id: String?,
        var itemsCount: Int?,
        var linkedinId: String?,
        var location: String?,
        var name: String?,
        var organization: String?,
        var permanentId: Int?,
        var profileImageUrl: String?,
        var teamOnly: Boolean?,
        var twitterScreenName: String?,
        var websiteUrl: String?
)
