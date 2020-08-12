package com.example.intern_anrdoid_2020.model.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class QiitaArticleResponse implements Serializable {

    public String rendered_body;
    public String body;
    public Boolean coediting;
    public String createdAt;
    public Group group;
    public String id;
    public Integer likesCount;
    public Boolean isPrivate;
    public Integer reactionsCount;
    public List<Tags> tags;
    public String title;
    public String updatedAt;
    public String url;
    public User user;
    public String pageViewsCount;

    public static class Group implements Serializable {
        public Date createdAt;

        public Integer id;
        public String name;
        public Boolean isPrivate;
        public String updatedAt;
        String urlName;

    }

    public static class Tags implements Serializable {
        public String name;
        public List<String> versions;
    }

    public static class User implements Serializable {
        public String description;
        public String facebookId;
        public Integer followeesCount;
        public Integer followersCount;
        public String githubLoginName;
        public String id;
        public Integer itemsCount;
        public String linkedinId;
        public String location;
        public String name;
        public String organization;
        public Integer permanentId;
        public String profileImageUrl;
        public Boolean teamOnly;
        public String twitterScreenName;
        public String websiteUrl;
    }
}
//
//
//[
//        {
//        "rendered_body": "<p>JavaScript言語は、JavaおよびC言語に基づいた構成を持っている、強力なクライアント側のマルチパラダイムの動的言語です。それに多数のタイプとオペレーター、組み込みオブジェクトやメソッドが含まれています。JavaScriptはオブジェクト指向プログラミングと関数型プログラミングの両方をサポートしていますので、1つの言語内でほぼどんなオブジェクトまたは機能でも作成できます。</p>\n\n<h2>\n<span id=\"javascriptの起源と最新のトレンドに詳しいjavascript-プログラマーを採用する方法\" class=\"fragment\"></span><a href=\"#javascript%E3%81%AE%E8%B5%B7%E6%BA%90%E3%81%A8%E6%9C%80%E6%96%B0%E3%81%AE%E3%83%88%E3%83%AC%E3%83%B3%E3%83%89%E3%81%AB%E8%A9%B3%E3%81%97%E3%81%84javascript-%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%9E%E3%83%BC%E3%82%92%E6%8E%A1%E7%94%A8%E3%81%99%E3%82%8B%E6%96%B9%E6%B3%95\"><i class=\"fa fa-link\"></i></a>JavaScriptの起源と最新のトレンドに詳しいJavaScript プログラマーを採用する方法</h2>\n\n<p>JavaScriptは単独で実行不可能であり、JavaScriptコードを実行するブラウザーが存在します。 ユーザーがJavaScriptの有効なHTMLページを開こうとすると、スクリプトがブラウザーに送信され、ブラウザーはスクリプトの下で動作します。ブラウザー以外に、JavaScriptはAdobeサービス、サーバーサイド環境、データベース、SVG画像などで表示することもできます。JavaScript言語は幅広いタイプのアプリケーションに使用できます。<br>\n<a href=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F3af83144-c5b0-beb7-ea33-c3917d2a6328.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;s=d356f05528cc2d7c92c9992ae54a7ef8\" target=\"_blank\" rel=\"nofollow noopener\"><img src=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F3af83144-c5b0-beb7-ea33-c3917d2a6328.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;s=d356f05528cc2d7c92c9992ae54a7ef8\" alt=\"javascript-kaihatsusha-infographic.png\" data-canonical-src=\"https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/459511/3af83144-c5b0-beb7-ea33-c3917d2a6328.png\" srcset=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F3af83144-c5b0-beb7-ea33-c3917d2a6328.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;w=1400&amp;fit=max&amp;s=9cadb8e1dfe2b7d887192c1c203f9fc2 1x\" loading=\"lazy\"></a></p>\n\n<h2>\n<span id=\"javascript開発の基本利点やトラップ\" class=\"fragment\"></span><a href=\"#javascript%E9%96%8B%E7%99%BA%E3%81%AE%E5%9F%BA%E6%9C%AC%E5%88%A9%E7%82%B9%E3%82%84%E3%83%88%E3%83%A9%E3%83%83%E3%83%97\"><i class=\"fa fa-link\"></i></a>JavaScript開発の基本、利点やトラップ</h2>\n\n<p>2018年にリリースされたState of the Developer Ecosystemのレポートによると、JavaScriptは3年連続で、世界で最も使用されているプログラミング言語であると認識されました。この調査は、世界中の17か国の6千人のプログラマーを対象に実施されました。</p>\n\n<p>JavaScriptプログラミング言語を使用し、他の言語の専門家の代わりにJavaScript プログラマーを採用する利点と欠点を説明します。間違いなく、利点の方が多いです。<br>\n<a href=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F4f8453e6-e607-7897-0f8b-90402ac9ec25.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;s=751eecf545f07d74c8c201e85413ef18\" target=\"_blank\" rel=\"nofollow noopener\"><img src=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F4f8453e6-e607-7897-0f8b-90402ac9ec25.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;s=751eecf545f07d74c8c201e85413ef18\" alt=\"javascript-kaihatsusha-no-tansho-to-chousho.png\" data-canonical-src=\"https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/459511/4f8453e6-e607-7897-0f8b-90402ac9ec25.png\" srcset=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F4f8453e6-e607-7897-0f8b-90402ac9ec25.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;w=1400&amp;fit=max&amp;s=9aff88f4dd6f66626d7d26e87219c5c4 1x\" loading=\"lazy\"></a></p>\n\n<h2>\n<span id=\"javascript-プログラマー-コスト\" class=\"fragment\"></span><a href=\"#javascript-%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%9E%E3%83%BC-%E3%82%B3%E3%82%B9%E3%83%88\"><i class=\"fa fa-link\"></i></a>Javascript プログラマー コスト</h2>\n\n<p>PayScaleによるトップ5か国のフリーランスベースでのJavaScript エンジニアの平均年間報酬をご覧ください。<br>\n<a href=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F7b727b5c-619f-c908-5111-5bd9d382e9b1.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;s=f9a1790bf3301b6cc9baf700993289ef\" target=\"_blank\" rel=\"nofollow noopener\"><img src=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F7b727b5c-619f-c908-5111-5bd9d382e9b1.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;s=f9a1790bf3301b6cc9baf700993289ef\" alt=\"javascript-developer-cost.png\" data-canonical-src=\"https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/459511/7b727b5c-619f-c908-5111-5bd9d382e9b1.png\" srcset=\"https://qiita-user-contents.imgix.net/https%3A%2F%2Fqiita-image-store.s3.ap-northeast-1.amazonaws.com%2F0%2F459511%2F7b727b5c-619f-c908-5111-5bd9d382e9b1.png?ixlib=rb-1.2.2&amp;auto=format&amp;gif-q=60&amp;q=75&amp;w=1400&amp;fit=max&amp;s=f560357710f4ed5345cfeb9c1f88c1db 1x\" loading=\"lazy\"></a><br>\nその国の一般的なJavaScript プログラマーの時給を詳しく見てみると、1時間あたりの報酬はイギリスが一番高いことが明らかになります。</p>\n\n<p>それでも、ウクライナのフリーランスJavaScript 開発者の時給は、JavaScriptプログラマーが勤務ないしは居住する上位国の中で最低です。ウクライナからのJavaScriptプログラマーが技術的知識と創造力において、世界中で非常に人気であるということはよく知られています。したがって、トップクラスのフリーランスJavaScriptエンジニアを採用する予定がある場合は、ウクライナのコーダーの採用をご検討ください。</p>\n\n<p>ウクライナの開発者にご興味のある方は、以下のリンクをご参照ください。<br>\n<a href=\"https://jp.mobilunity.com/blog/hire-javascript-developer-jp/\" class=\"autolink\" rel=\"nofollow noopener\" target=\"_blank\">https://jp.mobilunity.com/blog/hire-javascript-developer-jp/</a></p>\n",
//        "body": "JavaScript言語は、JavaおよびC言語に基づいた構成を持っている、強力なクライアント側のマルチパラダイムの動的言語です。それに多数のタイプとオペレーター、組み込みオブジェクトやメソッドが含まれています。JavaScriptはオブジェクト指向プログラミングと関数型プログラミングの両方をサポートしていますので、1つの言語内でほぼどんなオブジェクトまたは機能でも作成できます。\n\n##JavaScriptの起源と最新のトレンドに詳しいJavaScript プログラマーを採用する方法\nJavaScriptは単独で実行不可能であり、JavaScriptコードを実行するブラウザーが存在します。 ユーザーがJavaScriptの有効なHTMLページを開こうとすると、スクリプトがブラウザーに送信され、ブラウザーはスクリプトの下で動作します。ブラウザー以外に、JavaScriptはAdobeサービス、サーバーサイド環境、データベース、SVG画像などで表示することもできます。JavaScript言語は幅広いタイプのアプリケーションに使用できます。\n![javascript-kaihatsusha-infographic.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/459511/3af83144-c5b0-beb7-ea33-c3917d2a6328.png)\n\n##JavaScript開発の基本、利点やトラップ\n2018年にリリースされたState of the Developer Ecosystemのレポートによると、JavaScriptは3年連続で、世界で最も使用されているプログラミング言語であると認識されました。この調査は、世界中の17か国の6千人のプログラマーを対象に実施されました。\n\nJavaScriptプログラミング言語を使用し、他の言語の専門家の代わりにJavaScript プログラマーを採用する利点と欠点を説明します。間違いなく、利点の方が多いです。\n![javascript-kaihatsusha-no-tansho-to-chousho.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/459511/4f8453e6-e607-7897-0f8b-90402ac9ec25.png)\n\n##Javascript プログラマー コスト\nPayScaleによるトップ5か国のフリーランスベースでのJavaScript エンジニアの平均年間報酬をご覧ください。\n![javascript-developer-cost.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/459511/7b727b5c-619f-c908-5111-5bd9d382e9b1.png)\nその国の一般的なJavaScript プログラマーの時給を詳しく見てみると、1時間あたりの報酬はイギリスが一番高いことが明らかになります。\n\nそれでも、ウクライナのフリーランスJavaScript 開発者の時給は、JavaScriptプログラマーが勤務ないしは居住する上位国の中で最低です。ウクライナからのJavaScriptプログラマーが技術的知識と創造力において、世界中で非常に人気であるということはよく知られています。したがって、トップクラスのフリーランスJavaScriptエンジニアを採用する予定がある場合は、ウクライナのコーダーの採用をご検討ください。\n\nウクライナの開発者にご興味のある方は、以下のリンクをご参照ください。\nhttps://jp.mobilunity.com/blog/hire-javascript-developer-jp/\n",
//        "coediting": false,
//        "comments_count": 0,
//        "created_at": "2020-08-10T19:36:31+09:00",
//        "group": null,
//        "id": "b7d2de727ec165a2fada",
//        "likes_count": 0,
//        "private": false,
//        "reactions_count": 0,
//        "tags": [
//        {
//        "name": "Java",
//        "versions": []
//        },
//        {
//        "name": "JavaScript",
//        "versions": []
//        },
//        {
//        "name": "java8",
//        "versions": []
//        }
//        ],
//        "title": "JAVASCRIPT 開発者を採用する方法",
//        "updated_at": "2020-08-10T19:36:31+09:00",
//        "url": "https://qiita.com/anastasia_stefanuk/items/b7d2de727ec165a2fada",
//        "user": {
//        "description": "Mobilunityという急成長しているウクライナのIT企業にてマーケティングマネージャーを勤め英語や日本語でIT関係の記事を書いているアナスタシアと申します。",
//        "facebook_id": "",
//        "followees_count": 0,
//        "followers_count": 0,
//        "github_login_name": null,
//        "id": "anastasia_stefanuk",
//        "items_count": 2,
//        "linkedin_id": "",
//        "location": "Kyiv",
//        "name": "ステファニューク アナスタシア",
//        "organization": "Mobilunity",
//        "permanent_id": 459511,
//        "profile_image_url": "https://lh6.googleusercontent.com/-u-YkswO5P30/AAAAAAAAAAI/AAAAAAAAAA0/Mpti0j4OiiA/s50/photo.jpg",
//        "team_only": false,
//        "twitter_screen_name": null,
//        "website_url": "https://jp.mobilunity.com/"
//        },
//        "page_views_count": null
//        }
