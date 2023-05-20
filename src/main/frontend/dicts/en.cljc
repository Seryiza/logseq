(ns frontend.dicts.en
  "Provides translation to EN"
  #?(:cljs (:require [shadow.resource :as rc])))

(def ^:large-vars/data-var dicts
  {:accessibility/skip-to-main-content "Skip to main content"
   :tutorial/text #?(:cljs (rc/inline "tutorial-en.md")
                     :default "tutorial-en.md")
   :tutorial/dummy-notes #?(:cljs (rc/inline "dummy-notes-en.md")
                            :default "dummy-notes-en.md")
   :on-boarding/demo-graph "This is a demo graph, changes will not be saved until you open a local folder."
   :on-boarding/add-graph "Add a graph"
   :on-boarding/open-local-dir "Open a local directory"
   :on-boarding/new-graph-desc-1 "Logseq supports both Markdown and Org-mode. You can open an existing directory or create a new one on your device, a directory is also known simply as a folder. Your data will be stored only on this device."
   :on-boarding/new-graph-desc-2 "After you have opened your directory, it will create three folders in that directory:"
   :on-boarding/new-graph-desc-3 "/journals - store your journal pages"
   :on-boarding/new-graph-desc-4 "/pages - store the other pages"
   :on-boarding/new-graph-desc-5 "/logseq - store configuration, custom.css, and some metadata."
   :on-boarding/welcome-whiteboard-modal-title "A new canvas for your thoughts."
   :on-boarding/welcome-whiteboard-modal-description "Whiteboards are a great tool for brainstorming and organization. Now you can place any of your thoughts from the knowledge base or new ones next to each other on a spatial canvas to connect, associate and understand in new ways."
   :on-boarding/welcome-whiteboard-modal-skip "Skip"
   :on-boarding/welcome-whiteboard-modal-start "Start whiteboarding"
   :on-boarding/tour-whiteboard-home "{1} Home for your whiteboards"
   :on-boarding/tour-whiteboard-home-description "Whiteboards have their own section in the app where you can see them at a glance, create new ones or delete them easily."
   :on-boarding/tour-whiteboard-new "{1} Create new whiteboard"
   :on-boarding/tour-whiteboard-new-description "There are multiple ways of creating a new whiteboard. One of them is always right here in the dashboard."
   :help/start "Getting started"
   :help/about "About Logseq"
   :help/roadmap "Roadmap"
   :help/bug "Bug report"
   :help/feature "Feature request"
   :help/changelog "Changelog"
   :help/blog "Logseq blog"
   :help/docs "Documentation"
   :help/privacy "Privacy policy"
   :help/terms "Terms"
   :help/forum-community "Forum community"
   :help/awesome-logseq "Awesome Logseq"
   :help/shortcuts "Keyboard shortcuts"
   :help/shortcuts-triggers "Triggers"
   :help/shortcut "Shortcut"
   :help/slash-autocomplete "Slash autocomplete"
   :help/block-content-autocomplete "Block content autocomplete"
   :help/reference-autocomplete "Page reference autocomplete"
   :help/block-reference "Block reference"
   :help/open-link-in-sidebar "Open link in sidebar"
   :more "More"
   :search/result-for "Search result for "
   :search/items "items"
   :search/page-names "Search page names"
   :search-item/whiteboard "Whiteboard"
   :search-item/page "Page"
   :search-item/file "File"
   :search-item/block "Block"
   :help/context-menu "Block context menu"
   :help/markdown-syntax "Markdown syntax"
   :help/org-mode-syntax "Org mode syntax"
   :bold "Bold"
   :italics "Italics"
   :highlight "Highlight"
   :strikethrough "Strikethrough"
   :code "Code"
   :untitled "Untitled"
   :right-side-bar/help "Help"
   :right-side-bar/switch-theme "Theme modes"
   :right-side-bar/contents "Contents"
   :right-side-bar/page-graph "Page graph"
   :right-side-bar/history "(Dev) Undo/Redo history"
   :right-side-bar/block-ref "Block references"
   :right-side-bar/graph-view "Graph view"
   :right-side-bar/all-pages "All pages"
   :right-side-bar/whiteboards "Whiteboards"
   :right-side-bar/flashcards "Flashcards"
   :right-side-bar/new-page "New page"
   :right-side-bar/show-journals "Show Journals"
   :right-side-bar/separator "Right sidebar resize handler"
   :left-side-bar/journals "Journals"
   :left-side-bar/create "Create"
   :left-side-bar/new-page "New page"
   :left-side-bar/new-whiteboard "New whiteboard"
   :left-side-bar/nav-favorites "Favorites"
   :left-side-bar/nav-recent-pages "Recent"
   :page/something-went-wrong "Something went wrong"
   :page/logseq-is-having-a-problem "Logseq is having a problem. To try to get it back to a working state, please try the following safe steps in order:"
   :page/step "Step {1}"
   :page/try "Try"
   :page/presentation-mode "Presentation"
   :page/delete-confirmation "Are you sure you want to delete this page and its file?"
   :page/open-in-finder "Open in directory"
   :page/open-with-default-app "Open with default app"
   :page/make-public "Make it public for publishing"
   :page/version-history "View page history"
   :page/open-backup-directory "Open page backups directory"
   :page/make-private "Make it private"
   :page/delete "Delete page"
   :page/add-to-favorites "Add to Favorites"
   :page/unfavorite "Unfavorite page"
   :page/show-journals "Show journals"
   :page/show-whiteboards "Show whiteboards"
   :block/name "Page name"
   :page/earlier "Earlier"
   :page/copy-page-url "Copy page URL"
   :file/name "File name"
   :file/last-modified-at "Last modified at"
   :file/no-data "No data"
   :file/format-not-supported "Format .{1} is not supported."
   :file/validate-existing-file-error "Page already exists with another file: {1}, current file: {2}. Please keep only one of them and re-index your graph."
   :file-rn/re-index "Re-index is strongly recommended after the files are renamed and on other devices after syncing."
   :file-rn/need-action "File rename actions are suggested to match the new format. Re-index is required on all devices when the renamed files are synced."
   :file-rn/or-select-actions " or individually rename files below, then "
   :file-rn/or-select-actions-2 ". These actions are not available once you close this panel."
   :file-rn/legend "🟢 Optional rename actions; 🟡 Rename action required to avoid title change; 🔴 Breaking change."
   :file-rn/close-panel "Close the Panel"
   :file-rn/all-action "Apply all Actions!"
   :file-rn/select-format "(Developer Mode Option, Dangerous!) Select filename format"
   :file-rn/rename "rename file \"{1}\" to \"{2}\""
   :file-rn/apply-rename "Apply the file rename operation"
   :file-rn/suggest-rename "Action required: "
   :file-rn/otherwise-breaking "Or title will become"
   :file-rn/no-action "Well done! No further action required."
   :file-rn/confirm-proceed "Update format!"
   :file-rn/select-confirm-proceed "Dev: write format"
   :file-rn/unreachable-title "Warning! The page name will become {1} under current filename format, unless the `title::` property is set manually"
   :file-rn/optional-rename "Suggestion: "
   :file-rn/format-deprecated "You are currently using an outdated format. Updating to the latest format is highly recommended. Please backup your data and close Logseq clients on other devices before the operation."
   :file-rn/filename-desc-1 "This setting configures how a page is stored to a file. Logseq stores a page to a file with the same name."
   :file-rn/filename-desc-2 "Some characters like \"/\" or \"?\" are invalid for a filename."
   :file-rn/filename-desc-3 "Logseq replaces invalid characters with their URL encoded equivalent to make them valid (e.g. \"?\" becomes \"%3F\")."
   :file-rn/filename-desc-4 "The namespace separator \"/\" is also replaced by \"___\" (triple underscore) for aesthetic consideration."
   :file-rn/instruct-1 "It's a 2-step process to update filename format:"
   :file-rn/instruct-2 "1. Click "
   :file-rn/instruct-3 "2. Follow the instructions below to rename the files to the new format:"
   :page/created-at "Created At"
   :page/updated-at "Updated At"
   :page/backlinks "Back Links"
   :linked-references/filter-search "Search in linked pages"
   :editor/block-search "Search for a block"
   :text/image "Image"
   :asset/show-in-folder "Show image in folder"
   :asset/open-in-browser "Open image in browser"
   :asset/delete "Delete image"
   :asset/copy "Copy image"
   :asset/maximize "Maximize image"
   :asset/confirm-delete "Are you sure you want to delete this {1}?"
   :asset/physical-delete "Remove the file too (notice it can't be restored)"
   :color/gray "Gray"
   :color/red "Red"
   :color/yellow "Yellow"
   :color/green "Green"
   :color/blue "Blue"
   :color/purple "Purple"
   :color/pink "Pink"
   :editor/copy "Copy"
   :editor/cut "Cut"
   :editor/expand-block-children "Expand all"
   :editor/collapse-block-children "Collapse all"
   :editor/delete-selection "Delete selected blocks"
   :editor/cycle-todo "Rotate the TODO state of the current item"
   :dev/show-page-data "(Dev) Show page data"
   :dev/show-block-data "(Dev) Show block data"
   :dev/show-block-ast "(Dev) Show block AST"
   :dev/show-page-ast "(Dev) Show page AST"
   :content/copy-export-as "Copy / Export as.."
   :content/copy-block-url "Copy block URL"
   :content/copy-block-ref "Copy block ref"
   :content/copy-block-emebed "Copy block embed"
   :content/copy-ref "Copy this reference"
   :content/delete-ref "Delete this reference"
   :content/replace-with-text "Replace with text"
   :content/replace-with-embed "Replace with embed"
   :content/open-in-sidebar "Open in sidebar"
   :content/click-to-edit "Click to edit"
   :context-menu/make-a-flashcard "Make a Flashcard"
   :context-menu/toggle-number-list "Toggle number list"
   :context-menu/preview-flashcard "Preview Flashcard"
   :context-menu/make-a-template "Make a Template"
   :context-menu/input-template-name "What's the template's name?"
   :context-menu/template-include-parent-block "Including the parent block in the template?"
   :context-menu/template-exists-warning "Template already exists!"
   :settings-page/git-confirm "You need to restart the app after updating the Git settings."
   :settings-page/git-switcher-label "Enable Git auto commit"
   :settings-page/git-commit-delay "Git auto commit seconds"
   :settings-page/edit-config-edn "Edit config.edn"
   :settings-page/edit-global-config-edn "Edit global config.edn"
   :settings-page/edit-custom-css "Edit custom.css"
   :settings-page/edit-export-css "Edit export.css"
   :settings-page/edit-setting "Edit"
   :settings-page/custom-configuration "Custom configuration"
   :settings-page/custom-global-configuration "Custom global configuration"
   :settings-page/custom-theme "Custom theme"
   :settings-page/export-theme "Export theme"
   :settings-page/show-brackets "Show brackets"
   :settings-page/spell-checker "Spell checker"
   :settings-page/auto-updater "Auto updater"
   :settings-page/disable-sentry "Send usage data and diagnostics to Logseq"
   :settings-page/disable-sentry-desc "Logseq will never collect your local graph database or sell your data."
   :settings-page/preferred-outdenting "Logical outdenting"
   :settings-page/show-full-blocks "Show all lines of a block reference"
   :settings-page/auto-expand-block-refs "Expand block references automatically when zoom-in"
   :settings-page/custom-date-format "Preferred date format"
   :settings-page/custom-date-format-warning "Re-index required! Existing journal references would be broken!"
   :settings-page/preferred-file-format "Preferred file format"
   :settings-page/preferred-workflow "Preferred workflow"
   :settings-page/preferred-pasting-file "Prefer pasting file"
   :settings-page/enable-shortcut-tooltip "Enable shortcut tooltip"
   :settings-page/enable-timetracking "Timetracking"
   :settings-page/enable-tooltip "Tooltips"
   :settings-page/enable-journals "Journals"
   :settings-page/enable-all-pages-public "All pages public when publishing"
   :settings-page/customize-shortcuts "Keyboard shortcuts"
   :settings-page/shortcut-settings "Customize shortcuts"
   :settings-page/home-default-page "Set the default home page"
   :settings-page/enable-block-time "Block timestamps"
   :settings-page/clear-cache "Clear cache"
   :settings-page/clear "Clear"
   :settings-page/clear-cache-warning "Clearing the cache will discard open graphs. You will lose unsaved changes."
   :settings-page/developer-mode "Developer mode"
   :settings-page/developer-mode-desc "Developer mode helps contributors and extension developers test their integrations with Logseq more efficiently."
   :settings-page/current-version "Current version"
   :settings-page/tab-general "General"
   :settings-page/tab-editor "Editor"
   :settings-page/tab-version-control "Version control"
   :settings-page/tab-advanced "Advanced"
   :settings-page/tab-assets "Assets"
   :settings-page/tab-features "Features"
   :settings-page/plugin-system "Plugins"
   :settings-page/enable-flashcards "Flashcards"
   :settings-page/network-proxy "Network proxy"
   :settings-page/filename-format "Filename format"
   :settings-page/alpha-features "Alpha features"
   :settings-page/beta-features "Beta features"
   :settings-page/login-prompt "To access new features before anyone else you must be an Open Collective Sponsor or Backer of Logseq and therefore log in first."
   :settings-page/sync "Sync"
   :settings-page/enable-whiteboards "Whiteboards"
   :yes "Yes"

   :submit "Submit"
   :cancel "Cancel"
   :close "Close"
   :delete "Delete"
   :save "Save"
   :type "Type"
   :host "Host"
   :port "Port"
   :re-index "Re-index"
   :re-index-detail "Rebuild the graph"
   :re-index-multiple-windows-warning "You need to close the other windows before re-index this graph."
   :re-index-discard-unsaved-changes-warning "Re-index will discard the current graph, and then processes all the files again as they are currently stored on disk. You will lose unsaved changes and it might take a while. Continue?"
   :open-new-window "New window"
   :sync-from-local-files "Refresh"
   :sync-from-local-files-detail "Import changes from local files"
   :sync-from-local-changes-detected "Refresh detects and processes files modified on your disk that have diverged from the current Logseq page content. Continue?"

   :search/publishing "Search"
   :search "Search or create page"
   :whiteboard/link-whiteboard-or-block "Link whiteboard/page/block"
   :page-search "Search in the current page"
   :graph-search "Search graph"
   :new-page "New page"
   :new-whiteboard "New whiteboard"
   :new-graph "Add new graph"
   :graph "Graph"
   :graph/persist "Logseq is syncing internal status, please wait for several seconds."
   :graph/persist-error "Internal status sync failed."
   :graph/save "Saving..."
   :graph/save-success "Saved successfully"
   :graph/save-error "Save failed"
   :graph/all-graphs "All graphs"
   :graph/local-graphs "Local graphs"
   :graph/remote-graphs "Remote graphs"
   :export "Export"
   :export-graph "Export graph"
   :export-page "Export page"
   :export-markdown "Export as standard Markdown (no block properties)"
   :export-opml "Export as OPML"
   :export-public-pages "Export public pages"
   :export-json "Export as JSON"
   :export-roam-json "Export as Roam JSON"
   :export-edn "Export as EDN"
   :all-graphs "All graphs"
   :all-pages "All pages"
   :all-whiteboards "All whiteboards"
   :all-files "All files"
   :remove-orphaned-pages "Remove orphaned pages"
   :all-journals "All journals"
   :settings "Settings"
   :settings-of-plugins "Plugins"
   :plugins "Plugins"
   :themes "Themes"
   :relaunch-confirm-to-work "Should relaunch app to make it work. Do you want to restart it now?"
   :import "Import"
   :importing "Importing"
   :join-community "Join the community"
   :discourse-title "Our forum!"
   :help-shortcut-title "Click to check shortcuts and other tips"
   :loading "Loading"
   :parsing-files "Parsing files"
   :loading-files "Loading files"
   :login "Login"
   :logout "Logout"
   :download "Download"
   :language "Language"
   :remove-background "Remove background"
   :remove-heading "Remove heading"
   :heading "Heading {1}"
   :auto-heading "Auto heading"
   :open-a-directory "Open a local directory"

   :help/shortcut-page-title "Keyboard shortcuts"

   :plugin/installed "Installed"
   :plugin/not-installed "Not installed"
   :plugin/installing "Installing"
   :plugin/install "Install"
   :plugin/reload "Reload"
   :plugin/update "Update"
   :plugin/check-update "Check update"
   :plugin/check-all-updates "Check all updates"
   :plugin/found-updates "New updates"
   :plugin/found-n-updates "Found {1} updates"
   :plugin/update-all-selected "Update all of selected"
   :plugin/updates-downloading "Downloading updates"
   :plugin/refresh-lists "Refresh lists"
   :plugin/enabled "Enabled"
   :plugin/disabled "Disabled"
   :plugin/update-available "Update available"
   :plugin/updating "Updating"
   :plugin/uninstall "Uninstall"
   :plugin/marketplace "Marketplace"
   :plugin/downloads "Downloads"
   :plugin/stars "Stars"
   :plugin/title "Title"
   :plugin/all "All"
   :plugin/unpacked "Unpacked"
   :plugin/delete-alert "Are you sure you want to uninstall the plugin [{1}]?"
   :plugin/open-settings "Open settings"
   :plugin/open-package "Open package"
   :plugin/load-unpacked "Load unpacked plugin"
   :plugin/restart "Restart App"
   :plugin/unpacked-tips "Select the plugin directory"
   :plugin/contribute "✨ Write and submit new plugin"
   :plugin/up-to-date "It's up to date"
   :plugin/custom-js-alert "Found the custom.js file, is it allowed to execute? (If you don't understand the content of this file, it is recommended not to allow execution, which has certain security risks.)"
   :plugin.install-from-file/menu-title "Install from plugins.edn"
   :plugin.install-from-file/title "Install plugins from plugins.edn"
   :plugin.install-from-file/notice "The following plugins will replace your plugins:"
   :plugin.install-from-file/success "All plugins installed!"

   :pdf/copy-ref "Copy ref"
   :pdf/copy-text "Copy text"
   :pdf/linked-ref "Linked references"
   :pdf/toggle-dashed "Dashed style for area highlight"
   :pdf/hl-block-colored "Colored label for highlight block"
   :pdf/doc-metadata "Document metadata"

   :updater/new-version-install "A new version has been downloaded."
   :updater/quit-and-install "Restart to install"

   :paginates/pages "Total {1} pages"
   :paginates/prev "Prev"
   :paginates/next "Next"

   :tips/all-done "All Done"

   :command-palette/prompt "Type a command"
   :select/default-prompt "Select one"
   :select/default-select-multiple "Select one or multiple"
   :select.graph/prompt "Select a graph"
   :select.graph/empty-placeholder-description "No matched graphs. Do you want to add another one?"
   :select.graph/add-graph "Yes, add another graph"

   :file-sync/other-user-graph "Current local graph is bound to other user's remote graph. So can't start syncing."
   :file-sync/graph-deleted "The current remote graph has been deleted"
   :file-sync/rsapi-cannot-upload-err "Unable to start synchronization, please check if the local time is correct."

   :notification/clear-all "Clear all"

   :shortcut.category/basics "Basics"
   :shortcut.category/formatting "Formatting"
   :shortcut.category/navigating "Navigation"
   :shortcut.category/block-editing "Block editing general"
   :shortcut.category/block-command-editing "Block command editing"
   :shortcut.category/block-selection "Block selection (press Esc to quit selection)"
   :shortcut.category/toggle "Toggle"
   :shortcut.category/whiteboard "Whiteboard"
   :shortcut.category/others "Others"

   ;; Commands are nested for now to stay in sync with the shortcuts system.
   ;; Other languages should not nest keys under :commands
   :commands
   {:date-picker/complete         "Date picker: Choose selected day"
    :date-picker/prev-day         "Date picker: Select previous day"
    :date-picker/next-day         "Date picker: Select next day"
    :date-picker/prev-week        "Date picker: Select previous week"
    :date-picker/next-week        "Date picker: Select next week"
    :pdf/previous-page            "Pdf: Previous page of current pdf doc"
    :pdf/next-page                "Pdf: Next page of current pdf doc"
    :pdf/close                    "Pdf: Close current pdf doc"
    :pdf/find                     "Pdf: Search text of current pdf doc"
    :auto-complete/complete       "Auto-complete: Choose selected item"
    :auto-complete/prev           "Auto-complete: Select previous item"
    :auto-complete/next           "Auto-complete: Select next item"
    :auto-complete/shift-complete "Auto-complete: Open selected item in sidebar"
    :auto-complete/open-link      "Auto-complete: Open selected item in browser"
    :cards/toggle-answers         "Cards: show/hide answers/clozes"
    :cards/next-card              "Cards: next card"
    :cards/forgotten              "Cards: forgotten"
    :cards/remembered             "Cards: remembered"
    :cards/recall                 "Cards: take a while to recall"
    :editor/escape-editing        "Escape editing"
    :editor/backspace             "Backspace / Delete backwards"
    :editor/delete                "Delete / Delete forwards"
    :editor/new-block             "Create new block"
    :editor/new-line              "New line in current block"
    :editor/new-whiteboard        "New whiteboard"
    :editor/follow-link           "Follow link under cursor"
    :editor/open-link-in-sidebar  "Open link in sidebar"
    :editor/bold                  "Bold"
    :editor/italics               "Italics"
    :editor/highlight             "Highlight"
    :editor/strike-through        "Strikethrough"
    :editor/clear-block           "Delete entire block content"
    :editor/kill-line-before      "Delete line before cursor position"
    :editor/copy-embed            "Copy a block embed pointing to the current block"
    :editor/kill-line-after       "Delete line after cursor position"
    :editor/beginning-of-block    "Move cursor to the beginning of a block"
    :editor/end-of-block          "Move cursor to the end of a block"
    :editor/forward-word          "Move cursor forward a word"
    :editor/backward-word         "Move cursor backward a word"
    :editor/forward-kill-word     "Delete a word forwards"
    :editor/backward-kill-word    "Delete a word backwards"
    :editor/replace-block-reference-at-point "Replace block reference with its content at point"
    :editor/paste-text-in-one-block-at-point "Paste text into one block at point"
    :editor/insert-youtube-timestamp         "Insert youtube timestamp"
    :editor/cycle-todo              "Rotate the TODO state of the current item"
    :editor/up                      "Move cursor up / Select up"
    :editor/down                    "Move cursor down / Select down"
    :editor/left                    "Move cursor left / Open selected block at beginning"
    :editor/right                   "Move cursor right / Open selected block at end"
    :editor/select-up               "Select content above"
    :editor/select-down             "Select content below"
    :editor/move-block-up           "Move block up"
    :editor/move-block-down         "Move block down"
    :editor/open-edit               "Edit selected block"
    :editor/select-block-up         "Select block above"
    :editor/select-block-down       "Select block below"
    :editor/delete-selection        "Delete selected blocks"
    :editor/expand-block-children   "Expand"
    :editor/collapse-block-children "Collapse"
    :editor/indent                  "Indent block"
    :editor/outdent                 "Outdent block"
    :editor/copy                    "Copy (copies either selection, or block reference)"
    :editor/copy-text               "Copy selections as text"
    :editor/cut                     "Cut"
    :editor/undo                    "Undo"
    :editor/redo                    "Redo"
    :editor/insert-link             "HTML Link"
    :editor/select-all-blocks       "Select all blocks"
    :editor/select-parent           "Select parent block"
    :editor/zoom-in                 "Zoom in editing block / Forwards otherwise"
    :editor/zoom-out                "Zoom out editing block / Backwards otherwise"
    :editor/toggle-undo-redo-mode   "Toggle undo redo mode (global or page only)"
    :editor/toggle-number-list      "Toggle number list"
    :whiteboard/select              "Select tool"
    :whiteboard/pan                 "Pan tool"
    :whiteboard/portal              "Portal tool"
    :whiteboard/pencil              "Pencil tool"
    :whiteboard/highlighter         "Highlighter tool"
    :whiteboard/eraser              "Eraser tool"
    :whiteboard/connector           "Connector tool"
    :whiteboard/text                "Text tool"
    :whiteboard/rectangle           "Rectangle tool"
    :whiteboard/ellipse             "Ellipse tool"
    :whiteboard/reset-zoom          "Reset zoom"
    :whiteboard/zoom-to-fit         "Zoom to drawing"
    :whiteboard/zoom-to-selection   "Zoom to fit selection"
    :whiteboard/zoom-out            "Zoom out"
    :whiteboard/zoom-in             "Zoom in"
    :whiteboard/send-backward       "Move backward"
    :whiteboard/send-to-back        "Move to back"
    :whiteboard/bring-forward       "Move forward"
    :whiteboard/bring-to-front      "Move to front"
    :whiteboard/lock                "Lock selection"
    :whiteboard/unlock              "Unlock selection"
    :whiteboard/group               "Group selection"
    :whiteboard/ungroup             "Ungroup selection"
    :whiteboard/toggle-grid         "Toggle the canvas grid"
    :ui/toggle-brackets             "Toggle whether to display brackets"
    :go/search-in-page              "Search blocks in the current page"
    :go/electron-find-in-page       "Find text in page"
    :go/electron-jump-to-the-next   "Jump to the next match to your Find bar search"
    :go/electron-jump-to-the-previous "Jump to the previous match to your Find bar search"
    :go/search                      "Search pages and blocks"
    :go/journals                    "Go to journals"
    :go/backward                    "Backwards"
    :go/forward                     "Forwards"
    :search/re-index                "Rebuild search index"
    :sidebar/open-today-page        "Open today's page in the right sidebar"
    :sidebar/close-top              "Closes the top item in the right sidebar"
    :sidebar/clear                  "Clear all in the right sidebar"
    :misc/copy                      "mod+c"
    :command-palette/toggle         "Toggle command palette"
    :graph/export-as-html           "Export public graph pages as html"
    :graph/open                     "Select graph to open"
    :graph/remove                   "Remove a graph"
    :graph/add                      "Add a graph"
    :graph/save                     "Save current graph to disk"
    :graph/re-index                 "Re-index current graph"
    :command/run                    "Run git command"
    :go/home                        "Go to home"
    :go/all-graphs                  "Go to all graphs"
    :go/whiteboards                 "Go to whiteboards"
    :go/all-pages                   "Go to all pages"
    :go/graph-view                  "Go to graph view"
    :go/keyboard-shortcuts          "Go to keyboard shortcuts"
    :go/tomorrow                    "Go to tomorrow"
    :go/today                       "Go to today"
    :go/next-journal                "Go to next journal"
    :go/prev-journal                "Go to previous journal"
    :go/flashcards                  "Toggle flashcards"
    :ui/toggle-document-mode        "Toggle document mode"
    :ui/toggle-settings             "Toggle settings"
    :ui/toggle-right-sidebar        "Toggle right sidebar"
    :ui/toggle-left-sidebar         "Toggle left sidebar"
    :ui/toggle-help                 "Toggle help"
    :ui/toggle-theme                "Toggle between dark/light theme"
    :ui/toggle-contents             "Toggle Contents in sidebar"
   ;;  :ui/open-new-window             "Open another window"
    :command/toggle-favorite        "Add to/remove from favorites"
    :editor/open-file-in-default-app "Open file in default app"
    :editor/open-file-in-directory   "Open file in parent directory"
    :editor/copy-current-file        "Copy current file"
    :editor/copy-page-url           "Copy page url"
    :ui/toggle-wide-mode             "Toggle wide mode"
    :ui/select-theme-color           "Select available theme colors"
    :ui/goto-plugins                 "Go to plugins dashboard"
    :ui/install-plugins-from-file    "Install plugins from plugins.edn"
    :editor/toggle-open-blocks       "Toggle open blocks (collapse or expand all blocks)"
    :ui/toggle-cards                 "Toggle cards"
    :ui/clear-all-notifications      "Clear all notifications"
    :git/commit                      "Create git commit with message"
    :dev/show-block-data             "(Dev) Show block data"
    :dev/show-block-ast              "(Dev) Show block AST"
    :dev/show-page-data              "(Dev) Show page data"
    :dev/show-page-ast               "(Dev) Show page AST"}})
