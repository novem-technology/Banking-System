<template>
  <nav class="navbar fixed-top navbar-expand-lg navbar-light navbar-custom">
    <div class="container">
      <a class="navbar-brand" href="/account">
        Novem Financial
      </a>
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <span class="nav-link disabled" href="#">{{ pageTitle }}</span>
          </li>
        </ul>
        <ul class="navbar-nav ml-auto">
          <li class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              href="#"
              id="navbarDropdown"
              role="button"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >My Account</a>
            <div
              class="dropdown-menu dropdown-menu-right no-radius"
              aria-labelledby="navbarDropdown"
            >
              <a class="dropdown-item" href="/account">Account Overview</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="/account/transfer">Transfer Money</a>
              <a class="dropdown-item" href="/account/loans">Manage Loans</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="/">Logout</a>
            </div>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

@Component
export default class ProfileNavbar extends Vue {
  @Prop() private pageTitle!: string;
}
</script>

<style lang="scss">

</style>
