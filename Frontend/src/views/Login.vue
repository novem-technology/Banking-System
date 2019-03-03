<template>
  <div id="login-page">
    <Navbar/>
    <div class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
          <div class="login-form panel">
            <div class="form-group">
              <label for="usr">Username:</label>
              <input type="text" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="pwd">Password:</label>
              <input type="password" class="form-control" id="pwd">
            </div>
            <a class="btn btn-primary" href="/account">Login</a>
          </div>
        </div>
        <div class="col-4"></div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import Navbar from '@/components/Navbar.vue';

export default {
  components: {
    Navbar,
  },
};
</script>

<style lang="scss">
#login-page {
  padding-top: 50px;
}

.login-form {
  padding-left: 10px;
  padding-right: 10px;
}
</style>

