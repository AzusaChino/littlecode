use std::cell::RefCell;
use std::rc::Rc;

use crate::TreeNode;

pub type OptNode = Option<Rc<RefCell<TreeNode>>>;

mod binary_tree_level_order_traversal;
mod binary_tree_preorder_traversal;
mod minimum_time_to_collect_all_apples_in_a_tree;
mod same_tree;
mod symmetric_tree;
